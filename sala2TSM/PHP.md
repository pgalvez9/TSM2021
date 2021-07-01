# Método PHP

## Link

https://fjdurlop.000webhostapp.com/PHP.php?Nombre=Update&ID=3&Valor=5

## Instrucciones

1. Ingresar el link en la barra de búsqueda de su navegador
2. Elegir si quiere actualizar un valor o agregar uno nuevo
3. Si quiere agregar un valor, coloque Nombre=New, ID=n donde n es el ID que va a agregar, valor=x donde x es el valor a añadir 
4. Si quiere actualizar un valor, coloque Nombre=Update, ID=n donde n es el ID que va a actualizar, valor=x donde x es el valor a cambiar
5. Dar enter 
6. Revisar que imprima un "OK" 
7. Revisar base de datos

## Método




<?php
 
// Create connection
//Mysqli_connect(localhost o ip publica, id dusuario, contra, id de base de datos )
$con=mysqli_connect("localhost","id17119641_fjdurlop","U3((1W{0MsCzuvlo","id17119641_my_database");
// Check connection
if (mysqli_connect_errno())
{
  echo "Failed to connect to MySQL: " . mysqli_connect_error();
}

$nombre = $_GET["Nombre"];
$valor = $_GET["Valor"]; 
$ID = $_GET["ID"];

//Si solo se manda la variable Nombre = Update, ID = int,  Valor = int; modifique el valor en la base de datos, PHP debe regresar un OK
//    - Si Solo se manda la variable Nombre = New; genere un nuevo renglon en la base de datos, PHP debe regresar OK
//    - La estructura de la base de datos por lo tanto solo tiene 2 columnas ID (automatico) Valor (entero)
//    - Guarda el link de tu metodo PHP y las instrucciones y el script en PHP.md


if($nombre == "Update")
{
	// Query to create a new row in Dispositivos
	$sql = "UPDATE `baseDeDatosSala2` SET  `Valor`=".$valor." WHERE `ID`=".$ID;
	// Confirm there are results
	if (mysqli_query($con, $sql))
	{
		print("OK");
	}
	else
	{
		print("error");
	}
	
}elseif($nombre == "New")
{
	$sql = "INSERT INTO `baseDeDatosSala2`(`ID`, `Valor`) VALUES (".$ID.",".$valor.")";
		// Confirm there are results
	if (mysqli_query($con, $sql))
	{
		print("OK");
	}
	else
	{
		print("error");
	}
	
}


 

// Close connections
mysqli_close($con);
?>

