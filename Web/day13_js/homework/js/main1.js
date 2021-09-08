for(let i=1; i<=9; i+=1) {
    document.write("<div>")
    document.write("<h3>" + i + "단</h3>")
    
    for(let j=1; j<=9; j+=1) {
        document.write(i + "x" + j + "=" + i*j + "<br>")    
    }

    document.write("</div>")
}