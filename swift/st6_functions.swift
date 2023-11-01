func number () -> Int {
    return 100
}

func factorial (number : Int) -> Int {
    var fact : Int = 1

    for i in 1...number{
        fact *= i
        
    }

    return fact
}

var n : Int = 5


print("Factorial of \(n) = \(factorial(number: n))")

func minMax(array: [Int]) -> (min: Int, max: Int) {
    var currentMin = array[0]
    var currentMax = array[0]
    for value in array[1..<array.count] {
        if value < currentMin {
            currentMin = value
        } else if value > currentMax {
            currentMax = value
        }
    }
    return (currentMin, currentMax)
}
var arr : [Int] = [1,2,23,55,12,44,2]

let bounds = minMax(array: arr)
print("min is \(bounds.min) and max is \(bounds.max)")


func great(name: String) -> String {
    "Hello, \(name)"
}

print(great(name: "Gautam"))