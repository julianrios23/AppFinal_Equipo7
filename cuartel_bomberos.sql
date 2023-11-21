-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2023 a las 22:36:16
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
(58, 'Coti', 'Romero', 28012454, '1994-02-09', 'B+', 41, '2664757580', 1, '124'),
(60, 'Hector', 'Fernandez', 3012345, '1990-11-02', 'O+', 34, '1664325465', 1, '124'),
(63, 'Pedro', 'Aznar', 25369874, '1980-11-21', 'B-', 36, '26554128754', 1, '6000'),
(68, 'Alfredo', 'Junco', 24563789, '2005-11-06', 'A+', 33, '2654789654', 1, '333'),
(69, 'juan', 'palomino', 4563214, '1998-11-05', 'B+', 40, '12369854', 1, '555');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `id_brigada` int(11) NOT NULL,
  `nombre_brigada` varchar(20) NOT NULL,
  `especialidad` varchar(30) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `id_cuartel` int(11) NOT NULL,
  `disponibilidad` tinyint(4) NOT NULL,
  `nombre_cuartel` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`id_brigada`, `nombre_brigada`, `especialidad`, `estado`, `id_cuartel`, `disponibilidad`, `nombre_cuartel`) VALUES
(33, 'Matafuegos', 'INCENDIO_EN_VIVIENDA', 1, 6, 1, 'Los Matafuego'),
(34, 'AlfaCasa', 'INCENDIO_EN_VIVIENDA', 1, 7, 1, 'San Luis Capital'),
(35, 'AlfaIndustria', 'INCENDIO_EN_INDUSTRIA', 1, 7, 1, 'San Luis Capital'),
(36, 'BetaDerrumbe', 'SOCORRO_EN_DERRUMBE', 1, 7, 1, 'San Luis Capital'),
(37, 'DeltaSierras', 'SOCORRO_AMBITO_DE_MONTAÑA', 1, 7, 1, 'San Luis Capital'),
(38, 'OmegaTransito', 'PREVENCION', 1, 9, 1, 'Juana Koslay'),
(39, 'MojarrasAlRescate', 'SOCORRO_INUNDACIONES', 1, 8, 1, 'La Punta'),
(40, 'AlaDelta', 'SOCORRO_EN_ALTURA', 1, 8, 1, 'La Punta'),
(41, 'MatafuegosInd', 'INCENDIO_EN_INDUSTRIA', 1, 9, 1, 'Juana Koslay');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `id_cuartel` int(11) NOT NULL,
  `nombre_cuartel` varchar(50) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `coord_X` decimal(10,0) NOT NULL,
  `coord_Y` decimal(10,0) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `correo` varchar(20) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`id_cuartel`, `nombre_cuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `correo`, `estado`) VALUES
(6, 'Los Matafuego', 'San Luis', 2030, 3020, '26548512', 'matafuego@gmail.com', 1),
(7, 'San Luis Capital', 'San Luis - Capital', 460, 708, '2664566778', 'SLcapital@gmail.com', 1),
(8, 'La Punta', 'San Luis - La Punta Dos', 108, 301, '2664200432', 'bomblp@gmail.com', 1),
(9, 'Juana Koslay', 'San Luis - Juana Koslay', 500, 200, '2664121323', 'bombjk@gmail.com', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `cod_siniestro` int(11) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `fechaSiniestro` date NOT NULL,
  `horaSiniestro` varchar(5) NOT NULL,
  `coord_X` double(10,0) NOT NULL,
  `coord_Y` double(10,0) NOT NULL,
  `detalles` varchar(200) NOT NULL,
  `fechaResoluc` date NOT NULL,
  `horaResoluc` varchar(6) NOT NULL,
  `puntuacion` int(11) NOT NULL,
  `id_brigada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`cod_siniestro`, `tipo`, `fechaSiniestro`, `horaSiniestro`, `coord_X`, `coord_Y`, `detalles`, `fechaResoluc`, `horaResoluc`, `puntuacion`, `id_brigada`) VALUES
(18, 'INCENDIO_EN_VIVIENDA', '2023-11-20', '14.40', 900, 600, 'Aparente cortocircuito', '2023-11-21', '00:00', 9, 34),
(19, 'INCENDIO_EN_VIVIENDA', '2023-11-19', '15.11', 1500, 900, 'aaaaasdexc', '2023-11-21', '15:11', 9, 34),
(20, 'SOCORRO_AMBITO_DE_MONTAÑA', '2023-11-19', '15:14', 800, 1050, 'perdidos en accion', '2023-11-21', '15:15', 7, 37),
(21, 'SOCORRO_AMBITO_DE_MONTAÑA', '2023-11-18', '10:15', 900, 1600, 'Senderistas extraviados', '2023-11-21', '17:37', 10, 37),
(22, 'SOCORRO_ACCIDENTE_DE_TRANSITO', '2023-11-20', '06:55', 1010, 308, 'Colision multiple', '2023-11-21', '15:18', 9, 38),
(23, 'INCENDIO_EN_INDUSTRIA', '2023-11-05', '12:45', 1500, 600, 'Incendio tablero electrico', '2023-11-21', '22:15', 10, 35),
(24, 'SOCORRO_EN_ALTURA', '2023-11-20', '22:57', 2800, 1230, 'Gato en el arbol', '2023-11-21', '18:02', 10, 40),
(25, 'SOCORRO_INUNDACIONES', '2023-11-20', '12:45', 1000, 2000, 'entra mucha agua', '2023-11-21', '10:00', 10, 39),
(26, 'SOCORRO_EN_ALTURA', '2023-11-20', '12:45', 900, 1200, 'muuyy altooo', '2023-11-21', '17:50', 10, 40);

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
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`id_brigada`),
  ADD UNIQUE KEY `nombre_brigada` (`nombre_brigada`),
  ADD KEY `id_cuartel` (`id_cuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`id_cuartel`),
  ADD UNIQUE KEY `nombre_cuartel` (`nombre_cuartel`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD UNIQUE KEY `cod_siniestro` (`cod_siniestro`),
  ADD UNIQUE KEY `cod_siniestro_2` (`cod_siniestro`),
  ADD KEY `id_brigada` (`id_brigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `id_bombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `id_brigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `id_cuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `cod_siniestro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`brigada`) REFERENCES `brigada` (`id_brigada`);

--
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`id_cuartel`) REFERENCES `cuartel` (`id_cuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`id_brigada`) REFERENCES `brigada` (`id_brigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
