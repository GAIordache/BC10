package qinner;

public class AnonymousClass {
	public  interface Height {
		int i = 3;

		void print();

		void write();
	}

	int i = 5;

	public static void main(String[] args) {
		final AnonymousClass ac = new AnonymousClass();
		System.out.print(ac.i);
		AnonymousClass.Height height = new AnonymousClass.Height() {
			public void print() {
				System.out.print(ac.i);
			}

			public void write() {
				System.out.print("x");
			}
		};
		height.print();
		//ac = null;
	}
}
