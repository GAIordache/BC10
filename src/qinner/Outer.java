package qinner;

public class Outer {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.new Inner();
	}
	
	void m(final int pX) {
		final int w = 0;
		
		class LocalInner {
			// $$Outer.this
			//$$pX
			// $$w
			void n() {
				int y = pX + w;
			}
		}
		
		this.new Inner();
		new LocalInner();
		//pX = 1;
		//pX =pX+1;
	}
	
	int mInt;
	
	//void z() {
	//	new LocalInner();
	//}

	class Inner {
		/// $$Outer.this
		Inner() {
		}
		
		void x() {
			mInt = 0;
		}
	}
}
