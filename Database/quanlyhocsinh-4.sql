-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 26, 2021 at 02:07 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlyhocsinh`
--

-- --------------------------------------------------------

--
-- Table structure for table `nhapdiem`
--

CREATE TABLE `nhapdiem` (
  `ID` varchar(11) NOT NULL,
  `monhoc` varchar(11) NOT NULL,
  `hocky` varchar(11) NOT NULL,
  `Diem15p` varchar(11) NOT NULL,
  `Diem45p` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhapdiem`
--

INSERT INTO `nhapdiem` (`ID`, `monhoc`, `hocky`, `Diem15p`, `Diem45p`) VALUES
('A1_1', 'Toán', 'I', '9', '9'),
('C1_1', 'Toán', 'I', '8', '7'),
('C1_2', 'Toán', 'II', '5', '9');

-- --------------------------------------------------------

--
-- Table structure for table `themhocsinh`
--

CREATE TABLE `themhocsinh` (
  `ID` varchar(10) NOT NULL,
  `Hovaten` varchar(30) NOT NULL,
  `NgaySinh` varchar(30) NOT NULL,
  `GioiTinh` varchar(30) NOT NULL,
  `DiaChi` varchar(30) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Lop` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `themhocsinh`
--

INSERT INTO `themhocsinh` (`ID`, `Hovaten`, `NgaySinh`, `GioiTinh`, `DiaChi`, `Email`, `Lop`) VALUES
('A1_1', 'Bùi Thị Ánh Hương', '20/02/2004', 'Nữ', 'Hải Phòng', 'buithianhhuong202@gmail.com', '12A1'),
('A1_11', 'Nguyễn Ngọc Thủy Tiên', '05/09/2004', 'Nữ', 'Lạng Sơn', 'nguyenngocthuytien05092004@gmail.com', '12A1'),
('A1_12', 'Nguyễn Văn Quốc Tuấn', '04/08/2004', 'Nam', 'hải phòng', 'nguyenvanquoctuan', '12A1'),
('A1_2', 'Chu Ngô Phương Thủy', '03/01/2004', 'Nữ', 'Nam Định', 'chungophuongthuy03012004@gmail.com', '12A1'),
('A1_3', 'Nguyễn Thị Hà', '03/02/2004', 'Nữ', 'Thanh Hóa', 'nguyenthiha03022004@gmail.com', '12A1'),
('A1_4', 'Đỗ Nguyễn An Huy', '15/03/2004', 'Nam', 'Nghệ An', 'donguyenanhuy15032004@gmail.com', '12A1'),
('A1_6', 'Nguyễn Gia Phong', '03/04/2004', 'Nam', 'Nam Định', 'nguyengiaphong03042004@gmail.com', '12A1'),
('A1_7', 'Trần Anh Quang', '04/06/2004', 'Nam', 'Hải Dương', 'trananhquang04062004@gmail.com', '12A1'),
('A1_8', 'Vũ Thảo Vân', '15/10/2004', 'Nữ', 'Quảng Ninh', 'vuthaovan15102004@gmail.com', '12A1'),
('A1_9', 'Lê Long Trường Thịnh', '26/12/2004', 'Nam', 'Thái Bình', 'lelongtruongthinh26122004@gmail.com', '12A1'),
('A2_3', 'BÙI DUY QUANG' , '10/07/2004', 'Nam',	'Thái Bình', 'quangprobui01@gmail.com', '12A2')
('A2_1', 'VŨ HỮU QUÂN' , '14/04/2004' ,	'Hà Nam' , 'huuquan10a2@gmail.com' , '12A2')
('B1_1', 'Nguyễn Minh Đạt', '01/01/2005', 'Nam', 'Nam Định', 'nguyenminhdat@gmail.com', '11B1'),
('B1_2', 'Nguyễn Huyền Trang', '05/06/2005', 'Nam', 'Hà Nội', 'nguyenhuyentrang05062005@gmail.com', '11B1'),
('B1_4', 'TÒNG CHÂU BÌNH' , '12/03/2005' , 'Nam' , 'Hòa Bình, 'binhdzsp@gmail.com' , '11B1'),
('B1_3', 'NGUYỄN TRUNG KIÊN' '01/02/2004', 'Nam' , 'Hà Nội', 'kienphysic7@gmail.com' , '11B1'),
('C1_1', 'Hoàng Anh Đức', '10/01/2006', 'Nam', 'Thanh Hóa', 'hoanganhduc10012006@gmail.com', '10C1'),
('C1_2', 'Bùi Thị Lan', '04/03/2004', 'Nữ', 'Hải Phòng', 'buithilan04032004@gmail.com', '10C1');
('C1_5, 'NGUYỄN VĂN LÂM' , '17/06/2004', 'Nam', 'Thanh Hoá', 'Lamlao0605@gmail.com', '10C1');
('C1_3, 'LÊ NGỌC LÂM', '30/3/2004' , 'Nam' , 'Hà Nội', 'lelam9967@gmail.com' , '10C1');
('C1_4, 'HOÀNG KHÁNH LINH', '12/02/2004' , 'Nữ' ,'Bắc Giang','truonglinhan2030@gmail.com', '10C1');
--
-- Indexes for dumped tables
--

--
-- Indexes for table `nhapdiem`
--
ALTER TABLE `nhapdiem`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `themhocsinh`
--
ALTER TABLE `themhocsinh`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
