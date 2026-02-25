CREATE DATABASE IF NOT EXISTS anime_store;
USE anime_store;

CREATE TABLE IF NOT EXISTS `anime_store`.`producer`
(
    `id`   INT          NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO anime_store.producer (id, name) VALUES (1, 'MASAHI KISHIMOTO');
INSERT INTO anime_store.producer (id, name) VALUES (2, 'Eiichiro Oda');
INSERT INTO anime_store.producer (id, name) VALUES (3, 'Chuck');