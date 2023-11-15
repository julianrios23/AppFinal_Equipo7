-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-11-2023 a las 19:22:36
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cuartel_bomberos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `id_bombero` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `dni` int(10) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `grupo_sanguineo` varchar(5) NOT NULL,
  `brigada` int(11) NOT NULL,
  `celular` varchar(15) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `chapa_iden` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`id_bombero`, `nombre`, `apellido`, `dni`, `fecha_nacimiento`, `grupo_sanguineo`, `brigada`, `celular`, `estado`, `chapa_iden`) VALUES
(30, 'Juan', 'Perez', 21000111, '1992-11-06', 'A+', 33, '265412547', 1, '1000'),
(31, 'Mateo', 'Sbodio', 30123456, '2000-11-01', 'A+', 33, '2664203040', 1, '100'),
(32, 'Julian', 'Rios', 30100200, '2000-11-06', 'O+', 33, '2664900900', 1, '101'),
(33, 'Gabriel', 'Torrez', 30123123, '2000-11-02', 'B+', 33, '2664123123', 1, '102'),
(34, 'Santiago', 'Silva', 28600500, '1998-11-05', 'AB+', 34, '2664300400', 1, '103'),
(35, 'Rodrigo', 'Perez', 29100123, '1995-11-03', 'A+', 34, '2664700890', 1, '104'),
(36, 'Fabian', 'Perez', 25000300, '1980-11-01', 'O+', 34, '2664101010', 1, '105'),
(37, 'Kevin', 'Perez', 30600780, '2000-11-02', 'A+', 34, '2664300500', 1, '106'),
(38, 'Fernando', 'Gandolfo', 28050134, '1990-11-02', 'A+', 35, '2664700890', 1, '107'),
(39, 'Angel', 'Gandolfo', 30980543, '1999-11-05', 'O+', 35, '2664300500', 1, '108'),
(40, 'Jorge', 'Lucero', 29050154, '1998-11-06', 'O+', 35, '2664406723', 1, '109'),
(41, 'Santiago', 'Gomez', 28050125, '1999-11-06', 'B+', 36, '2664700890', 1, '110'),
(42, 'Federico', 'Allia', 27050125, '1995-11-03', 'O-', 36, '2664123550', 1, '111'),
(43, 'Francisco', 'Polletta', 25000110, '1985-11-01', 'A+', 36, '2664325754', 1, '112'),
(44, 'Gustavo', 'Cerati', 25067892, '1997-11-08', 'O+', 37, '2664233233', 1, '113'),
(45, 'Gustavo', 'Napoli', 30990789, '1995-11-04', 'AB+', 37, '2664737373', 1, '114'),
(46, 'Chatly', 'Garcia', 30200123, '1994-11-11', 'O-', 37, '2664732010', 1, '115'),
(47, 'Homero', 'Simpsons', 30200100, '2000-11-04', 'B-', 38, '2664100100', 1, '116'),
(48, 'Barnie', 'Gomez', 30670889, '2001-11-10', 'O+', 38, '2664300768', 1, '117'),
(49, 'Bart', 'Simpsons', 32001245, '2003-11-04', 'O+', 38, '2664500600', 1, '118'),
(50, 'Juan', 'Nadaldian', 29550678, '1996-11-16', 'O+', 39, '2664300500', 1, '119'),
(51, 'Javier', 'Mojarrinson', 26789789, '1997-11-04', 'B+', 39, '2664560765', 1, '120'),
(52, 'Jose', 'Meolans', 29870124, '1995-08-04', 'O+', 39, '2664321321', 1, '121'),
(53, 'Felix', 'Baumgartner', 30567421, '2002-04-07', 'O+', 40, '2664780980', 1, '122'),
(54, 'Gato', 'Volador', 29870320, '1998-05-13', 'B+', 40, '2664202010', 1, '123'),
(55, 'Facundo', 'Cabral', 29050345, '1991-02-01', 'B+', 40, '2664325670', 1, '124'),
(56, 'Lionel', 'Messi', 10101010, '1990-11-10', 'O+', 41, '2664101011', 1, '124'),
(57, 'Kuni', 'Aguero', 29870674, '2000-02-02', 'O-', 41, '2664050477', 1, '125'),
(58, 'Coti', 'Romero', 28012454, '1994-02-09', 'B+', 41, '2664757580', 1, '124');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`id_bombero`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD UNIQUE KEY `dni_2` (`dni`),
  ADD KEY `brigada` (`brigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `id_bombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`brigada`) REFERENCES `brigada` (`id_brigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
