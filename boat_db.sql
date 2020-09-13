DROP DATABASE IF EXISTS boat_db;
CREATE DATABASE boat_db;
USE boat_db;
CREATE TABLE boats (
  id mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  name varchar(40) NOT NULL default '',
  description varchar(255) NOT NULL default '',
  PRIMARY KEY (id)
) ;

CREATE TABLE users (
  id mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  username varchar(40) NOT NULL default '',
  password varchar(255) NOT NULL default '',
  role varchar(40) NOT NULL default 'USER',
  enabled BOOLEAN NOT NULL default TRUE,
  PRIMARY KEY (id)
) ;

INSERT INTO
  boats (name, description)
VALUES
  ('SS-Survivaure', 'Capitaine Bleuten'),
  ('Black Pearl', 'Jack Sparow'),
  ('Enterprise', 'Captain Kirk');
  
INSERT INTO
  users (username, password)
VALUES
  ('user', 'password'),
  ('user2', '$2y$10$XWaZuUbjH/3d2rpSKFs85etpAIupSS/0sRquOie21Xsk8MgLyIXiW');

