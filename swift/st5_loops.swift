for i in 1...10{
    print(i)
}


for c in "Gautam"{
    print(c)
    
}


var inp:String? = readLine()

let num:Int = Int(inp!) ?? 2

var flag:Bool = true

for i in 2...Int(num/2){
    if(num % i == 0){
        flag = false
        break
    }
}

print(flag ? "\(num) is Prime" : "\(num) is not Prime")

