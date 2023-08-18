function getFileExtension(filename) {
    return filename.slice((filename.lastIndexOf(".") - 1 >>> 0) + 2);
  }
  
const filename = String(prompt("Enter filename: "));
alert("The file extension is: " + getFileExtension(filename));
