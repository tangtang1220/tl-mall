```shell script
docker run -p 3306:3306 --name mysql -v D:/docker/mysql/conf:/etc/mysql/conf.d -v D:/docker/mysql/logs:/logs -v D:/docker/mysql/data:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root -d mysql:5.7
```