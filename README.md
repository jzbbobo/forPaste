# forPaste
.box2{
float:left;
position:relative;
width:600px;
height:100px;
line-height: 100px;
border:1px solid white;
margin-left:300px; top:50%;
margin-top:-50px;
margin-bottom:20px;
box-sizing:border-box;
font-size:14px;
padding:10px;
box-shadow:0 0 2px rgba(0,0,0,.5)

}
.box2:before,
.box2:after{
position:absolute;
content:'';
width:14px;
height:14px;
bottom:-8px;
left:50%;
margin-left:-7px;
overflow:hidden;
pointer-events:none;
-webkit-transform:rotate(45deg);
-mz-transform:rotate(45deg);
transform:rotate(45deg);
}

.box2:before{
background:white;
box-shadow:1px 1px 2px rgba(0,0,0,.5)
 
 
}
.box2:after{
bottom:-7px;background:#fff;
background-image-source: url(demo.png");
}
