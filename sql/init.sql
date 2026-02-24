CREATE DATABASE IF NOT EXISTS anime_store;
USE anime_store;

-- 1. Criar Tabela Producer primeiro (porque Anime depende dela)
CREATE TABLE IF NOT EXISTS `producer`
(
    `id`   INT          NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`)
);

-- 2. Criar Tabela Anime com o nome ID_PRODUCER
CREATE TABLE IF NOT EXISTS `anime`
(
    `id`          INT          NOT NULL AUTO_INCREMENT,
    `name`        VARCHAR(255) NOT NULL,
    `episodes`    INT          NOT NULL,
    `id_producer` INT          NOT NULL,
    PRIMARY KEY (`id`),
    CONSTRAINT `fk_anime_producer`
        FOREIGN KEY (`id_producer`)
            REFERENCES `producer` (`id`)
            ON DELETE CASCADE
            ON UPDATE CASCADE
);

-- 3. Inserir os dados
INSERT INTO `producer` (id, name)
VALUES (1, 'Masashi Kishimoto'),
       (2, 'Eiichiro Oda'),
       (3, 'Hajime Isayama');