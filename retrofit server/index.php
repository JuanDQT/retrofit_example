<?php
$body = file_get_contents('php://input');
$data = json_decode($body, true);
error_log("Body: " . $body);
if($data["name"] != "" && $data["consulta"] != "")
{

	$latLngArray["lat"] = -33.4189513;
	$latLngArray["lng"] = -70.6010167;
	$gustosArray[0] 	= "Programar";
	$gustosArray[1] 	= "Salir";
	$array["nombre"] 	= "Nombre Ejemplo";
  	$array["pais"] 		=  "Chile";
  	$array["latLng"] 	= $latLngArray;
    $array["gustos"] 	= $gustosArray;
    echo(json_encode($array));

}
else
{
	$latLngArray["lat"] = 0;
	$latLngArray["lng"] = 0;
	$gustosArray[0] 	= "";
	$array["nombre"] 	= "No Request";
  	$array["pais"] 		=  "";
  	$array["latLng"] 	= $latLngArray;
    $array["gustos"] 	= $gustosArray;
    echo(json_encode($array));
}