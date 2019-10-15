package run;
import bean.Fraction;
import action.FractionAction;

public class Program {

	public static void main(String[] args) {
		Fraction f[] = FractionAction.createFractionArray(4);
		FractionAction.task(f);
		FractionAction.showFractionArray(f);

	}

}
