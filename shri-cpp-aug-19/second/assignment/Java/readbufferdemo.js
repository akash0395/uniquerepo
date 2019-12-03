var fs=require("fs");
fs.exists("test.txt",function(e){
	if(e){
		fs.stat("test.txt",function(err,status){
			if(err){
				console.log("error"+err);
			}
			else{
				var b=new Buffer(status.size);
				fs.open("test.txt","r",function(err,fd){
					if(err){
						console.log("error"+err);
					}
					else{
						fs.read(fd,b,0,b.length,null,function(err,bytesread,b){
							if(err){
								console.log("error"+err);
							}
							else{
								console.log(b.toString());
							}
							
						});
					}
					
					
				});
			}
		});
	}
	else{
		console.log("not found");
	}

	
	
});