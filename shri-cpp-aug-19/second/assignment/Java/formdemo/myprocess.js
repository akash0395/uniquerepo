var m1=require('./module1');

var http=require('http');
var v=require('url');
var q=require('querystring');
var fs=require('fs');

function process(req,resp)
{
var p=v.parse(req.url);
resp.writeHead(200,{'Content-Type':'text/html'});
switch(p.pathname)
{
case '/':
fs.readFile("add.html", function(err,data){
if(err)
{
	resp.write("Some error");
	console.log(err);
}
else
{
	resp.write(data);
	resp.end();
}

});
break;
case '/calc':
	var d=q.parse(p.query);
	var s=m1.add(d.num1,d.num2);
	resp.write("Addition:" +s);
	resp.end();
	break;
}
}
var server = http.createServer(process);
server.listen(2000);
console.log("Server started, running on port no.2000...");