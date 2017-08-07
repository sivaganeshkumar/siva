<?php
$host = 'localhost';
$username = 'id2464666_admin';
$password = 'kalpana';
$db = 'id2464666_db';
$conn = mysqli_connect($host, $username, $password)or die("Unable to connect");
mysqli_select_db($conn,$db)or die("Unable to select");
if(isset($_POST['btn']))
{
                    $username= $_POST['name'];
                    $password =$_POST['pass'];  
                    $sql="SELECT * FROM test WHERE username ='$username' AND password='$password'   " ;  
                    $result=mysqli_query($conn,$sql)or die("Records not found !!!");
                    $count=mysqli_num_rows($result);
                    if($count>0){                        
                        header('location:resume.html');                       
                    }                
                    else{
                        echo "Invalid Credentials";
                    }
                    
            
}


 mysqli_close($conn);
?>

<html>
<head>
<meta charset="utf-8">
<title>Best Login Page design in html and css</title>
<style type="text/css">
body {
background-image:url("sd.jpg");
color: #5a5656;
font-family: 'Open Sans', Arial, Helvetica, sans-serif;
font-size: 16px;
line-height: 1.5em;
}
a { text-decoration: none; }
h1 { font-size: 1em;color:#560b00; }
h1, p {
margin-bottom: 10px;
}
strong {
font-weight: bold;
}
.uppercase { text-transform: uppercase; }

/* ---------- LOGIN ---------- */
#login {
margin: 50px auto;
width: 300px;
}

form fieldset input[type="text"], input[type="password"] {
background-color: #e5e5e5;
border: none;
border-radius: 3px;
-moz-border-radius: 3px;
-webkit-border-radius: 3px;
color: #5a5656;
font-family: 'Open Sans', Arial, Helvetica, sans-serif;
font-size: 14px;
height: 50px;
outline: none;
padding: 0px 10px;
width: 280px;
-webkit-appearance:none;
}
form fieldset input[type="submit"] {
background-color: #008dde;
border: none;
border-radius: 3px;
-moz-border-radius: 3px;
-webkit-border-radius: 3px;
color: #f4f4f4;
cursor: pointer;
font-family: 'Open Sans', Arial, Helvetica, sans-serif;
height: 50px;
text-transform: uppercase;
width: 300px;
-webkit-appearance:none;
}
form fieldset a {
color: #5a5656;
font-size: 10px;
}
form fieldset a:hover { text-decoration: underline;}


</style>
</head>
<body>
<div id="login">
<h1><strong>Welcome,</strong> Please login.</h1>
<form action="" method="post">
<fieldset style="background-color:white">
<p><input type="text" name="name" required placeholder="Username" ></p>
<p><input type="password" name="pass" required placeholder="password" ></p>
<p><input type="submit" name="btn" value="Login"></p>
</fieldset>
</form>


</div>

</body>
</html>
