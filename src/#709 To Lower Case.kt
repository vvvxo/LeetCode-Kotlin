fun toLowerCase(str: String): String {
    var tmpStr = str.toCharArray()
    for(i in tmpStr.indices){
        if (tmpStr[i] in 'A'..'Z'){
            tmpStr[i] = (tmpStr[i] + 32)
        }
    }
    return String(tmpStr)
}
