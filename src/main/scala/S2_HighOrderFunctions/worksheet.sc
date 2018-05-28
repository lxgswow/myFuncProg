def sum(f:Int=> Int)(a:Int,b:Int):Int = {
  if(a>b) 0
  else f(a) + sum(f)(a+1,b)
}
def cube(a:Int):Int = {
  a*a*a
}
sum(cube)(1,5)