package api;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ClassExam {

	public static void main(String[] args) throws ClassNotFoundException {
		ClassExam ce = new ClassExam();
		System.out.println(ce.getClass());
		System.out.println(ce.getClass().getName());
		Class clazz = Class.forName("api.Counter");
		System.out.println(clazz.getName());
	}

}
