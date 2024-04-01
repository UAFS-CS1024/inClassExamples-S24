package inClassMar29;

public class Subtract extends Operation {
	
	public Subtract(String op, int num1, int num2){
		this.setOp(op);
		this.setNum1(num1);
		this.setNum2(num2);
	}
	
	@Override
	public int performOp() {
		return this.getNum1() - this.getNum2();
	}

}
