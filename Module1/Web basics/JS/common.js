var msg; 
msg="<p><code>The actual script is in external script file called common.js</code></p>";
function addNos(headVar,bodyVar){
	document.write(msg);
	var sum = headVar+bodyVar;
	document.write('The sum of the variables <em>headVar</em> and <em>bodyVar</em> is '+sum);
}