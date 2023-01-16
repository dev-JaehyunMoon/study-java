package castingStudy;

public class CastingStudy {
	// ���ø���
	// �ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
	// ����ڰ� ������ ������
	// �ִϸ��̼��̶�� "�ڸ�����"��� ���
	// ��ȭ��� "4D"��� ���
	// ��󸶶�� "����"��� ���
	public void checkNetflix(Netflix netflix) {
		if(netflix instanceof Animation) {
			Animation animation = (Animation) netflix;
			animation.getSubtitle();
			
		}else if(netflix instanceof Movie) {
			Movie movie = (Movie) netflix;
			movie.movieFour();
		}else if(netflix instanceof Drama){
			Drama drama = (Drama) netflix;
			drama.sellGoods();
		}
		
	}
	public static void main(String[] args) {
		Netflix[] netflix = {new Animation(), new Movie(), new Drama()};
		CastingStudy castingStudy = new CastingStudy();
		
		for (int i = 0; i < netflix.length; i++) {
			castingStudy.checkNetflix(netflix[i]);
		}
	}
}
