<?php

echo "<br>";
$saat=strtotime("16:15");


echo date('d.m.Y <br>');
echo "<br>";
 
if($saat>strtotime("06:00") and $saat< strtotime("10:00")  )
{
    echo "<br>";
    echo "GÜNAYDIN! <br>";
}

else if($saat>strtotime("10:00") and $saat< strtotime("17:00"))
{
    echo "<br>";
    echo "İYİ GÜNLER! <br>";
}

else if($saat>strtotime("17:00") and $saat< strtotime("20:00"))
{
    echo "<br>";
    echo "İYİ AKŞAMLAR! <br>";
}
else
   echo "İYİ GECELER!";
?>