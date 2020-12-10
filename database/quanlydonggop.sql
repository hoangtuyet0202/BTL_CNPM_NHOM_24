-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 10, 2020 lúc 05:52 AM
-- Phiên bản máy phục vụ: 10.4.14-MariaDB
-- Phiên bản PHP: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlydonggop`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `donggop`
--

CREATE TABLE `donggop` (
  `MaDongGop` int(11) NOT NULL,
  `MaHoKhau` int(11) NOT NULL,
  `SoTienDG` int(11) NOT NULL,
  `MaTheLoaiDG` int(11) NOT NULL,
  `NgayDongGop` date NOT NULL,
  `GhiChu` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `donggop`
--

INSERT INTO `donggop` (`MaDongGop`, `MaHoKhau`, `SoTienDG`, `MaTheLoaiDG`, `NgayDongGop`, `GhiChu`) VALUES
(1, 1, 20000, 1, '2020-12-01', NULL),
(2, 2, 20000, 1, '2020-12-01', ''),
(3, 1, 100000, 2, '2020-12-01', ''),
(4, 1, 10000, 3, '2020-12-01', ''),
(6, 2, 10000, 2, '2020-12-02', ''),
(7, 2, 100000, 3, '2020-12-02', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hokhau`
--

CREATE TABLE `hokhau` (
  `MaHoKhau` int(11) NOT NULL,
  `TenHoKhau` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoNhanKhau` int(11) NOT NULL,
  `DiaChi` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `hokhau`
--

INSERT INTO `hokhau` (`MaHoKhau`, `TenHoKhau`, `SoNhanKhau`, `DiaChi`) VALUES
(1, 'Hoàng Văn An', 4, 'Hà Nội'),
(2, 'Nguyễn Văn Bình', 5, 'Hà Nội'),
(3, 'Lê Duy Nhất', 3, 'Hà Nội'),
(4, 'Nguyễn Tiến Đạt', 4, 'Hà Nội'),
(5, 'Nguyễn Tiến Dũng', 5, 'Hà Nội'),
(6, 'Trần Trung Kiên', 3, 'Hà Nội'),
(7, 'Nguyễn Minh Quân', 2, 'Hà Nội'),
(8, 'Lý Văn Công', 6, 'Hà Nội'),
(9, 'Nguyễn Anh Dũng', 4, 'Hà Nội'),
(10, 'Nguyễn Anh Đức', 4, 'Hà Nội'),
(11, 'Nguyễn Bảo Khang', 3, 'Hà Nội'),
(12, 'Nguyễn Chí Dũng', 5, 'Hà Nội'),
(13, 'Nguyễn Công Danh', 7, 'Hà Nội'),
(14, 'Nguyễn Duy Mạnh', 8, 'Hà Nội'),
(15, 'Nguyễn Đức Phúc', 6, 'Hà Nội'),
(16, 'Nguyễn Đức Tài', 4, 'Hà Nội'),
(17, 'Nguyễn Gia Bảo', 2, 'Hà Nội'),
(18, 'Phạm Huy Hoàng', 4, 'Hà Nội'),
(19, 'Phạm Hữu Tâm', 3, 'Hà Nội'),
(20, 'Phạm Khôi Nguyên', 4, 'Hà Nội'),
(21, 'Phạm Quốc Trung', 5, 'Hà Nội'),
(22, 'Phạm Trung Kiên', 4, 'Hà Nội'),
(23, 'Bùi Anh Tuấn', 4, 'Hà Nội'),
(24, 'Bùi Bảo Nam', 6, 'Hà Nội'),
(25, 'Bùi Duy Hưng', 4, 'Hà Nội'),
(26, 'Bùi Gia Huy', 2, 'Hà Nội'),
(27, 'Bùi Mạnh Hùng', 4, 'Hà Nội'),
(28, 'Bùi Minh Quân', 3, 'Hà Nội'),
(29, 'Trần Anh Tuấn', 4, 'Hà Nội'),
(30, 'Trần Bảo Long', 5, 'Hà Nội'),
(31, 'Trần Thanh Phong', 4, 'Hà Nội'),
(32, 'Đặng Gia Hưng', 4, 'Hà Nội'),
(33, 'Đặng Huy Hoàng', 2, 'Hà Nội'),
(34, 'Đặng Phúc Lâm', 4, 'Hà Nội'),
(35, 'Đặng Quốc Bảo', 3, 'Hà Nội'),
(36, 'Vũ Anh Tuấn', 4, 'Hà Nội'),
(37, 'Vũ Ðức Thắng', 5, 'Hà Nội'),
(38, 'Vũ Hoàng Dương', 4, 'Hà Nội'),
(39, 'Vũ Hùng Mạnh', 6, 'Hà Nội'),
(40, 'Nguyễn Đăng Khoa', 4, 'Hà Nội'),
(41, 'Nguyễn Đức Cường', 4, 'Hà Nội'),
(42, 'Đặng Đức Duy', 4, 'Hà Nội');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `id` int(11) NOT NULL,
  `username` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`id`, `username`, `password`) VALUES
(1, 'admin', '1'),
(2, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `theloaidonggop`
--

CREATE TABLE `theloaidonggop` (
  `MaTheLoaiDG` int(11) NOT NULL,
  `TenLoaiDG` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgayBatDauThu` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `theloaidonggop`
--

INSERT INTO `theloaidonggop` (`MaTheLoaiDG`, `TenLoaiDG`, `NgayBatDauThu`) VALUES
(1, 'Trợ giúp đồng bào bị ảnh hưởng lũ lụt', '2020-12-02'),
(2, 'Ủng hộ ngày tết thiếu nhi', '2020-11-11'),
(3, 'Ủng hộ vì người nghèo', '2020-11-02'),
(4, 'Ủng hộ ngày thương binh- liệt sỹ 27/07', '2020-12-01');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thuphi`
--

CREATE TABLE `thuphi` (
  `MaThuPhi` int(11) NOT NULL,
  `MaHoKhau` int(11) NOT NULL,
  `NgayThuPhi` date NOT NULL,
  `SoTien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `thuphi`
--

INSERT INTO `thuphi` (`MaThuPhi`, `MaHoKhau`, `NgayThuPhi`, `SoTien`) VALUES
(1, 2, '2020-12-01', 360000),
(2, 1, '2020-12-02', 288000),
(3, 3, '2020-11-01', 216000);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `donggop`
--
ALTER TABLE `donggop`
  ADD PRIMARY KEY (`MaDongGop`),
  ADD KEY `MaHoKhau` (`MaHoKhau`),
  ADD KEY `MaTheLoaiDG` (`MaTheLoaiDG`);

--
-- Chỉ mục cho bảng `hokhau`
--
ALTER TABLE `hokhau`
  ADD PRIMARY KEY (`MaHoKhau`);

--
-- Chỉ mục cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `theloaidonggop`
--
ALTER TABLE `theloaidonggop`
  ADD PRIMARY KEY (`MaTheLoaiDG`);

--
-- Chỉ mục cho bảng `thuphi`
--
ALTER TABLE `thuphi`
  ADD PRIMARY KEY (`MaThuPhi`),
  ADD KEY `MaHoKhau` (`MaHoKhau`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `donggop`
--
ALTER TABLE `donggop`
  ADD CONSTRAINT `donggop_ibfk_1` FOREIGN KEY (`MaHoKhau`) REFERENCES `hokhau` (`MaHoKhau`),
  ADD CONSTRAINT `donggop_ibfk_2` FOREIGN KEY (`MaTheLoaiDG`) REFERENCES `theloaidonggop` (`MaTheLoaiDG`);

--
-- Các ràng buộc cho bảng `thuphi`
--
ALTER TABLE `thuphi`
  ADD CONSTRAINT `thuphi_ibfk_1` FOREIGN KEY (`MaHoKhau`) REFERENCES `hokhau` (`MaHoKhau`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
