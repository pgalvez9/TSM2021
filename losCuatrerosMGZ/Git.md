# Comandos de Git

1. `git status` Te permite ver el estatus del repositorio, como ver  qué archivos han sido modificados y cuales están siendo trackeados
2. `git add` Te permite agregar archivos al stage, para que los cambios sean registrados y trackeados
3. `git checkout` Te pertmite moverte hacia otra rama o commit, especificando su nombre o su id, respectivamente.
4. `git commit`Agrega los cambios y "toma una foto" de los archivos que están en el stage (los que se agregaron con `git add`)
5. `git init` Inicializa un repostorio de git en un directorio local
6. `git clone` A través de GitHub, copia un repositorio de manera local, al cual le podemos hacer cambios para después actualizar el que está en GH.
7. `git merge` Trae los cambios de otra rama a la rama actual
8. `git stash` Permite guardar los cambios en una pila temporal al salir de una rama a la cual no se le ha hecho un commit. De esa manera los cambios no se pierden pero tampoco es necesario hacer un commit
9. `git pull` Trae los cambios que se han hecho al repositorio en GitHub a nuestra copia local
10.`git push` Empuja los cambios que hicimos en nuestro repositorio local al repositorio en GH.