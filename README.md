## DSL
An example of the DSL is given below-

	Network {
 alpha 0.005
 epochs 150
 myFunc(x) {
   function = 5.0 + 5.0
   derivative = (5.0-6.0)/8.0*(4.0+4.0)
  }
  myFunc2(x) {
   function = 5.0 + 5.0
   derivative = (5.0-6.0)/8.0*(4.0+4.0)
  }
  StrongFunction external
  SecretFunction external
  sig sigmoid 
  
 in {
  size 10
 }
 hidden {
  size 4
  activation SecretFunction
 }

 hidden {
  size 4
  activation StrongFunction
 }

 hidden {
  size 3
  activation myFunc
 }

 out {
  size 1
  activation sig
 }
}
