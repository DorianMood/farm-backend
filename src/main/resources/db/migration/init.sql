CREATE USER farm_user WITH PASSWORD 'farm_user';
CREATE schema farm authorization farm_user;
GRANT ALL PRIVILEGES ON DATABASE farm_db TO farm_user;