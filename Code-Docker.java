httpd
nginx
ubuntu
mongo



docker run -d --name -p 8080:80 proxy nginx  → 'Pulleamos la imagen nginx:latest y creamos un container llamado proxy basado en esa imagen 
                                                que se expone en nuestro Host en el Port 8080 y en el Container en el Port 80.'
docker run -d --name sw_1 httpd → 'Pulleamos la imagen apache server y creamos un container llamado sw_1 basado en esa imagen'





docker system prune -a:
- todos los contenedores detenidos
  - todas las redes no utilizadas por al menos un contenedor
  - todas las imágenes sin al menos un contenedor asociado
  - toda la caché de construcción