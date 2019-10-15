
mkdir -p /mysql/13306/data
mkdir -p /mysql/23306/data
mkdir -p /mysql/33306/data

mkdir -p /mysql/13306/conf
mkdir -p /mysql/23306/conf
mkdir -p /mysql/33306/conf


mkdir -p /mysql/slave/conf


# cp /etc/my.cnf /mysql/13306/conf/
# cp /etc/my.cnf /mysql/23306/conf/
# cp /etc/my.cnf /mysql/33306/conf/

# vi /mysql/13306/conf/my.cnf
# vi /mysql/23306/conf/my.cnf
# vi /mysql/33306/conf/my.cnf

mkdir -p /mysql/common/data
# cp -fr /mysql/common/data/mysql/* .
# cp -fr /mysql/23306/data/* .

# 目录访问权限
chmod -R 777 /mysql/13306/data
chmod -R 777 /mysql/23306/data
chmod -R 777 /mysql/33306/data
