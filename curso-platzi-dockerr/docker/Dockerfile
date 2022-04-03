# Esta basado en Node12
FROM node:14  

# Solo copiamos los ficheros de las dependencias
COPY ["package.json", "package-lock.json", "/usr/src/"]

# Directorio de Trabajo → Similar a cd /usr/src dentro del contexto de build.
WORKDIR /usr/src    

# Ya parados en /usr/src corremos un npm install 
RUN npm install     

#Copia todos los archivos del contexto de build (Ruta Actual del Host) a la Ruta /usr/src del Container.
COPY [".", "/usr/src/"] 

# Permite que el Port 3000 sea vinculable al Host huesped
EXPOSE 3000         

#CMD o Command que es el Comando o Proceso por defecto que va ejecutarse cuando corramos el container resultante de esta imagen sino especificamos otro cosa
#Modo Exec Form o Command Form 
CMD ["npm", "index.js"]    

        
        
