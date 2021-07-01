# Script
`<?php
 
// Create connection
$con=mysqli_connect("localhost","id17105202_beto","LosCuatreros30.","id17105202_nuevabase");
// Check connection
if (mysqli_connect_errno())
{
  echo "Failed to connect to MySQL: " . mysqli_connect_error();
}
 
if (isset($_GET["Nombre"]) && isset($_GET["ID"]) && isset($_GET["Valor"]))
{	
	// Query to create a new row in Dispositivos
	
	$Nombre = $_GET["Nombre"];
	
	if ($Nombre == "update"){
        $sql = "UPDATE `Actividad30Jun` SET `Valor` = {$_GET["Valor"]} WHERE ID = {$_GET["ID"]}";
    }
	 
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

else if (isset($_GET["Nombre"]))
{
    
    $Nombre = $_GET["Nombre"];
    
    if(($Nombre == "new")){
        $sql = "INSERT INTO `Actividad30Jun` (`ID`, `Valor`) VALUES (NULL, '0')";
    }
    
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

else
{
	print("Error");
}
	
// Close connections
mysqli_clo`

# URL
- https://tsm2021.000webhostapp.com/LoscuatrerosMGZ.php/?Nombre=new

# Instrucciones

El script primero establece una conexión con nuestra base de datos, posteriormente revisa los queries que se mandaron en la URL
del sitio. A partir de las variables que se encuentren en la URL, tomará una decisión y ejecutará el query de SQL correspondiente.
Cuando en el URL solo se encuentra el parámetro "Nombre" y este tiene un valor igual a "New", se agregará una nueva fila.
Por otro lado, si se encuentran los tres parámetros: "Valor": Int, "ID": Int y "Nombre": String y este último tiene un valor de "Update", la base de datos actualizará la fila correspondiente.
 