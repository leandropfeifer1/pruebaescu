<html><head><title>Conditional Statement</title></head>
<body bgcolor="lightgreen"><font size="+1">

<?php

 extract($_REQUEST);
 $price = ($age >= 1 && $age <= 18)? 1 : ($age >= 19 && $age <= 55)? 2 : 3;
 print "$name, age $age pays \$$price for the Happy Meal
 Special! <br />";
?>

</body>
</html>
</body>
</html>
