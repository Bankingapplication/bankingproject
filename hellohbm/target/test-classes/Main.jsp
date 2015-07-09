<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title>Bank Application</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
   <style>
     #wrapper{

    //background-color:#F6F3EE;
    color:#ef2c2c;
    margin-right:50px;
    margin-left:50px;


    }

    #logo{
    margin-top:60px;
    margin-left:20px;
    text-shadow:1px 3px 1px #efd487;

    }
    #image{
    float:right;
    position:absolute;
    left:350px;
    top:15px;

    }
     
    #nav-main {
            margin-top: 5px;
        }
           .nav{
               background-color:#b29fe1;
               height:100px;
               margin-top:50px;
               border:1px solid #bd7eb4 ;
               border-radius:5px;
                border-image:url(image6.gif) 30 30 round;
           
        }

        ul li{
            list-style-type:none;
            display:inline;
            margin:35px;
           
        }
      ul li a{
            text-decoration:none;
            color:black;
            font-weight:bold;
            text-align:center;
            margin:0;
            padding:0;
        }
    ul li a:hover{
           text-decoration:none;
           background-color:grey;
       }
    #statement{
        font-weight:bold;
            font-size:x-large;
            float:right;
    position:absolute;
    left:500px;
    top:35px;
    color:#894242;
    }
        
        #text{
            
            font-weight:bold;
            font-size:x-large;
        }
         #aside{
            border:1px solid #894242;
            border-radius:15px;
           
            background-color:#d8eaaa;
            color:black;
            position:absolute;
            right:10px;
            top:5px;
            margin:10px;
            padding:10px;
            
            width:400px;
        }
         #sidebar{
             float:right;
             position:absolute;
             right:0px;
             top:10px;
         }
         #side{
             
             position:absolute;
             right:50px;
             top:300px;
         }
      
        #footer{
            background-color:black;
            border:1px solid black;
            border-radius:5px;
            text-align:center;
            position:fixed;
            bottom:0px;
            width:92.5%;
            color:#a6bd6e;
        }
        #content{
           
            top:300px;
            position:absolute;
            left:120px;
            border:1px solid black;
            border-radius:5px;
            width:500px;
            height:200px;
            background-color:#e6c8c8;
            padding:20px;

        }
        #content a{
            color:#0026ff;
        }
        .amount{
            color:black;
            position:absolute;
            left:200px;
            
        }
    </style>
</head>
<body>
    <section id="wrapper">

        <section id="header">
            <div id="logo">
                <h1 id="text">S3G Banking Services</h1>
                <img id="image" src="images/image1.jpg" alt="bank logo" width="100" heigth="100" />
            <h1 id="statement">Online Banking</h1>
            </div><br />
            

            <nav id="nav-main">
                <div class="container">
                    <ul class="nav nav-tabs navbar-default navbar-static-top">
                        <li class="active"><a href="#" >Accounts</a></li>
                        <li><a href="#">Cashback Rewards</a></li>
                        <li><a href="#">Transfers</a></li>
                        <li><a href="#">Open an Account</a></li>
                        <li><a href="#">Help and Support</a></li>
                    </ul>
                </div>
            </nav>
        </section>
        <section id="content">
            

            
         <a href="#">Checkings Account</a>
            <input type="text" class="amount" value="$250"/><br /><br />
            <a href="#">Savings Account</a>
            <input type="text" class="amount" value="$250" /><br /><br />
            <a href="#">Credit card</a>
            <input type="text" class="amount" value="$250" />


        </section>
        <section id="aside">
            <p>Sravya</p>
            
                <div class="container">
                    <ul id="sidebar">
                        <li><a href="#">Profile & Settings</a></li>
                        <li><a href="#">Sign out</a></li>
                        </ul>
                    </div>
                
        </section>
        <section id="side">
            <iframe width="420" height="315"
                    src="https://www.youtube.com/watch?v=yfGKnFSQ4sE?autoplay=1"></iframe>
        </section>
            <section id="footer">
                <p>&copy; Marlabs Inc-2015</p>
            </section>
        </section>
</body>
</html>