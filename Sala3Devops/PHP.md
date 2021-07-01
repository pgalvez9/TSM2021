Link Update, modificar tabla: 
Variable Nombre = Update actualiza las variables ID y su valor de la tabla PHP

https://iottsmiid.000webhostapp.com/intentouno.php?Nombre=Update&ID=2&Valor=6

Link New generar renglones:

Variable Nombre = New para generar nuevo renglon

https://iottsmiid.000webhostapp.com/intentouno.php?Nombre=New

Script: 


<?php
 
// Create connection,localhost o ip pública del servidor,DB_user,contraseña,nombre base de datos
$con=mysqli_connect("localhost","id17105222_tablasala3devops","q|Ce-EZQZ~&T9Q()","id17105222_equiposala3devops");
// Check connection, para ver si hubo error al conectar
if (mysqli_connect_errno())
{
  echo "Failed to connect to MySQL: " . mysqli_connect_error();
}

//isset() regresa true o false si ese le dio valor a Status e ID en el URL
if(isset($_GET["Nombre"]))
{
	
	$Nombre = $_GET["Nombre"];
	if(strcmp($Nombre, "New") == 0)
	{
		// Query to create a new row in la columna Dispositivos
		$sql = "INSERT INTO `TablaEquipoSala3` (`ID`, `Valor`) VALUES (NULL, '0')";
 
		// Confirm there are results, hacer query y ser si jaló bien o no
		if (mysqli_query($con, $sql))
		{
			print("OK");
			
		}
		else
		{
			print("error");
		}
	}
	else if(strcmp($Nombre, "Update") == 0)
	{
		$Valor = $_GET["Valor"];
		$ID = $_GET["ID"];
		// Query to create a new row in la columna Dispositivos
		$sql = "UPDATE `TablaEquipoSala3` SET `Valor`=$Valor WHERE ID=$ID";
 
		// Confirm there are results, hacer query y ser si jaló bien o no
		if (mysqli_query($con, $sql))
		{
			print("OK");
		}
		else
		{
			print("error");
		}	
	}
}
else
{
	print("Var not defined");
}
// Close connections
mysqli_close($con);
?>



