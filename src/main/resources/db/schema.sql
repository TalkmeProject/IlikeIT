CREATE USER 'root'@'localhost' IDENTIFIED BY 'root';
CREATE DATABASE starter DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_bin;
GRANT ALL PRIVILEGES ON starter.* TO 'root'@'localhost' IDENTIFIED BY 'root';