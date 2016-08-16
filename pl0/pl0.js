function main(){
  var cnv = new fabric.Canvas('world');
  var rect = new fabric.Rect( {
    left : 100,
    top : 100,
    fill : 'blue',
    width : 20,
    height : 20,
    angle : 45
  });
  cnv.add(rect);
  alert('hi');
  rect.set({left:150});
  cnv.renderAll();
  console.log(cnv.getObjects());
}

window.addEventListener('load', main);
