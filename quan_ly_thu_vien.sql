create database quan_ly_thu_vien;
-- drop database quan_ly_thu_vien;
use quan_ly_thu_vien;

create table the_loai(
	ma_the_loai int AUTO_INCREMENT,
    ten_the_loai nvarchar(300) not null,
    constraint pk_the_loai primary key (ma_the_loai)
);
create table nha_xuat_ban(
	ma_nha_xuat_ban int AUTO_INCREMENT,
    ten_nha_xuat nvarchar(1000) not null,
    constraint pk_nha_xuat_ban primary key (ma_nha_xuat_ban)
);
ALTER TABLE nha_xuat_ban CHANGE COLUMN ten_nha_xuat  ten_nha_xuat_ban nvarchar(1000) not null;

create table sach(
	ma_sach int AUTO_INCREMENT,
    ten_sach nvarchar(10000) not null,
    ngay_nhap date not null,
    gia_tien float not null,
    ma_the_loai int,
    ma_nha_xuat_ban int,
    constraint pk_sach primary key (ma_sach)
);

-- Khóa ngoại
-- Bảng Sách
alter table sach add constraint fk_sach_the_loai foreign key (ma_the_loai) references the_loai(ma_the_loai);
alter table sach add constraint fk_sach_nha_xuat_ban foreign key (ma_nha_xuat_ban) references nha_xuat_ban(ma_nha_xuat_ban);

create table tai_khoan(
	ma_tai_khoan int AUTO_INCREMENT,
    ten_tai_khoan nvarchar(1000) not null,
    ho_ten nvarchar(1000) not null,
    mat_khau nvarchar(1000) not null,
    is_admin bool not null,
    constraint pk_tai_khoan primary key (ma_tai_khoan)
);

-- Dữ liệu cho bảng Thể loại 
insert into the_loai(ten_the_loai) values ('Khoa học viễn tưởng'), ('Tiểu thuyết'), ('Truyện tranh'), ('Kinh tế'), ('Tâm lý học');
-- Dữ liệu cho bảng Nhà xuất bản
 insert into nha_xuat_ban(ten_nha_xuat) values ('NXB Trẻ'), ('Kim Đồng'), ('Nhã Nam'), ('NXB Văn học'), ('NXB Thế Giới');

-- Dữ liệu cho bảng Sách
 insert into sach(ten_sach, ngay_nhap, gia_tien, ma_the_loai, ma_nha_xuat_ban) values ('1984', '2021-05-01', 100000, 1, 1), ('Người vô hình', '2021-06-02', 120000, 2, 2), ('One Piece', '2021-07-03', 50000, 3, 2), ('Kiếm vàng', '2021-08-04', 150000, 4, 3), ('Tâm lý học đám đông', '2021-09-05', 80000, 5, 4);

-- Dữ liệu cho bảng Tài khoản
 insert into tai_khoan(ten_tai_khoan, ho_ten, mat_khau, is_admin) values ('luongtopp', 'Trần Đức Lương', '12345', true);
 
-- Hiển thị dữ liệu bảng sách
select s.ma_sach, s.ten_sach, s.ngay_nhap, s.gia_tien, tl.ten_the_loai, nxb.ten_nha_xuat_ban from sach s 
inner join the_loai tl 
on tl.ma_the_loai = s.ma_the_loai 
inner join nha_xuat_ban nxb 
on nxb.ma_nha_xuat_ban = s.ma_nha_xuat_ban;


ALTER USER 'root'@'localhost' IDENTIFIED BY '1234';
