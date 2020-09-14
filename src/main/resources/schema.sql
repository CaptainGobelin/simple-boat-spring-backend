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

