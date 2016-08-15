function main(){
  var cnv = new fabric.Canvas('world');
  var rect = new fabric.Rect( {
    'left' : 100,
    'top' : 100,
    'fill' : 'blue',
    'width' : 20,
    'height' : 20});
  cnv.add(rect);
}

window.addEventListener('load', main)
