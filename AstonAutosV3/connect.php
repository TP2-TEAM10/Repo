<!--Pantelis Xiourouppas - 160056307 -->
<?php

//$con = new mysqli('localhost','u_160056307','WVYGb8D9cwqLUGs','u_160056307_db');
$con = new mysqli('localhost','root','','inventory');

if(!$con)
{
    die(mysqli_error($con));

}
?>