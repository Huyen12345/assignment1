create database QLBH
use QLBH 

create table TAI_KHOAN(
Username nvarchar(50) not null primary key,
Pass nvarchar(50) not null,
Vai_tro nvarchar(50) not null,
Ho_ten nvarchar(50) not null,
Dia_chi nvarchar(50) not null,
Email nvarchar(50) not null,
Sdt nvarchar (15) not null
)

create table LOAI_SP(
Ma_loai nchar(10) not null primary key,
Loai_sp nvarchar(50) not null,
)

create table SAN_PHAM(
Ma_sp nchar(10) not null primary key,
Ten_sp nvarchar(50) not null,
Mo_ta nvarchar(500) not null,
So_luong int not null,
Don_gia float not null,
Hinh_anh nvarchar(200) not null,
Nha_sx nvarchar(50) not null,
Ma_loai nchar(10) not null,
foreign key (Ma_loai) references LOAI_SP(Ma_loai)
)

create table DON_HANG(
Ma_don_hang nchar(10) not null primary key,
Username nvarchar(50) not null,
Ngay_mua datetime not null,
Trang_thai nchar(10),
foreign key (Username) references TAI_KHOAN(Username)
)

create table DON_HANG_CT(
Ma_don_hang_ct nchar(10) not null primary key,
Ma_don_hang nchar(10) not null,
Ma_sp nchar(10) not null,
So_luong int not null,
Gia_tien float not null,
foreign key (Ma_sp) references SAN_PHAM(Ma_sp),
foreign key (Ma_don_hang) references DON_HANG(Ma_don_hang),
)

-- Truy xuất nhập liệu
select * from TAI_KHOAN 
select * from LOAI_SP
select * from SAN_PHAM
select * from DON_HANG_CT
select * from DON_HANG



insert into TAI_KHOAN values(
'huyen','123','admin','huyen','111 NTT','ny@yahoo.com','11111111')
insert into TAI_KHOAN values(
'hoai','123','admin','Hoai','111 NTT','hoai@yahoo.com','22222222')
insert into TAI_KHOAN values(
'hue','123','admin','hue','111 NTT','hue@yahoo.com','33333333')

insert into LOAI_SP values(
'k01','Vans')
insert into LOAI_SP values(
'k02','Converse')
insert into LOAI_SP values(
'k03','sneaker')
insert into LOAI_SP values(
'k04','Adidas galaxy ')
insert into LOAI_SP values(
'k05','Nike')




insert into SAN_PHAM values(
'sp001','vans classic','Giày thể thao',200, 230000,'Image/k.jpg','Vans','k01')
insert into SAN_PHAM values(
'sp002','converse thap','giay thể thao việt nam',200, 200000,'Image/l.jpg','Converse','k02')
insert into SAN_PHAM values(
'sp003','Nike',' đẹp mắt',200, 250000,'Image/x.jpg','Nike','k05')
insert into SAN_PHAM values(
'sp004','sneaker','Hiện đang là xu hướng của thời đại',200, 230000,'Image/c.jpg','sneaker','k03')



insert into DON_HANG_CT values('dhct1','dh1','sp001',5,50000)
insert into DON_HANG_CT values('dhct2','dh2','sp002',5,60000)
insert into DON_HANG_CT values('dhct3','dh3','sp003',5,70000)
insert into DON_HANG_CT values('dhct4','dh4','sp004',5,80000)
insert into DON_HANG_CT values('dhct5','dh5','sp005',5,50000)

insert into DON_HANG values( 'dh1','huyen',11/11/2016,'chuan')
insert into DON_HANG values( 'dh2','hoai',11/11/2016,'chuan')
insert into DON_HANG values( 'dh3','hue',12/11/2016,'chuan')
