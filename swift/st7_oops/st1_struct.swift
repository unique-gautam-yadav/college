struct Resolution{
    var height: Int
    var width : Int

    func helloThere () -> String {
        print("Hello, There")
        return "Hello Gautam"
    }
}

var res : Resolution = Resolution(height: 512, width: 675);

print(res.helloThere());

