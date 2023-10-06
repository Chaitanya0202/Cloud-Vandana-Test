let display=document.getElementById("screen");
function show(n){
    display.value+=n;
}
function allclear(){
    display.value=""
}
function calc(){
    display.value=eval(display.value)
}