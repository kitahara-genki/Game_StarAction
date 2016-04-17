package stages;
import static constants.StageConstants.*;
public class StageMap {
	private static int[][][] map = {
			// stage1,基本移動操作
			{	{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h,h},
				{h,0,0,0,0,0,0,0,c,0,0,0,0,e,0,0,0,c,0,0,0,0,0,0,0,0,0,0,0,0,h,h,h},
				{h,0,0,0,0,0,0,0,0,h,h,h,h,h,h,h,h,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h,h},
				{h,0,0,0,0,s1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,G,0,0,0,0,0,0,h,h,h},
				{h,0,0,0,h,h,h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,g,h,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h,h,h},
				{h,0,0,0,0,0,0,0,0,e,0,u,u,u,u,u,u,0,w,0,0,n,0,0,0,0,0,0,0,0,h,h,h},
				{h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h}},

			// stage2,左クリック機能
			{	{h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,g,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h,h,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h,h,h,h,h,h,0,0,0,0,0,0,0,h},
				{h,0,0,0,s2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,h,h,h,0,0,0,0,0,0,0,0,0,0,0,h,0,0,0,0,0,0,0,h,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,0,0,0,0,0,0,0,h,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,h,u,u,u,u,u,u,u,u,u,u,h,0,0,0,s3,0,0,0,h,0,0,0,0,0,0,h},
				{h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h}},

			// stage3,右クリック機能
			{	{n,0,0,0,0,0,0,0,0,0,0,0,0,0,0,n,n,n},
				{n,0,0,0,0,0,0,0,0,0,0,0,0,0,0,n,n,n},
				{n,0,0,0,0,0,0,0,0,0,0,0,0,0,0,n,n,n},
				{n,0,0,0,0,0,0,0,0,0,0,0,0,0,0,n,n,n},
				{n,0,0,0,s4,0,0,0,0,0,0,0,0,0,0,n,n,n},
				{n,n,n,n,n,n,n,n,n,0,0,0,0,0,0,n,n,n},
				{n,e,e,G,e,G,G,G,n,0,0,0,0,0,0,n,n,n},
				{n,0,0,0,0,0,n,G,n,0,0,0,0,0,0,n,n,n},
				{n,n,n,n,n,n,n,G,n,0,0,0,0,0,g,n,n,n},
				{n,0,0,0,0,0,n,e,n,0,0,0,0,0,n,n,n,n},
				{n,0,0,0,0,0,n,e,n,0,0,0,0,0,n,n,n,n},
				{n,n,n,n,n,n,n,n,n,n,n,n,0,n,n,n,n,n}},

			// stage4,防御
			{	{h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h},
				{h,s,h,0,0,0,0,0,0,0,0,0,0,0,0,h,s,h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,h,h,0,0,0,0,0,0,0,0,0,0,0,0,h,h,h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h,h,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,s,h,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,n,n,n,n,n,n,n,n,h,h,h,n,0,0,0,0,0,0,h},
				{h,0,0,0,s5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,g,h},
				{h,0,0,h,h,h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,h,h,h,0,0,0,0,h,h,h,0,0,0,0,0,0,0,0,0,h,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,h,s,h,0,0,0,0,h,s,h,0,0,0,0,0,0,0,0,0,h,s,h},
				{h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h}},

			// stage5,ボス1
			{	{h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,k1,0,0,h,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h,h},
				{n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,h,h}},

				//stage2,新しい敵,右クリック機能,消えるブロック
			{	{n,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,n,n,n},
				{n,0,0,0,0,0,0,0,n,0,0,0,0,s,0,0,0,0,n,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,n,n,n},
				{n,0,0,0,0,0,0,n,n,n,n,n,n,n,n,n,n,n,n,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,n,n,n},
				{n,n,n,n,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,n,n,n},
				{n,0,0,0,0,0,0,0,n,0,0,0,0,0,0,0,0,0,0,n,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,n,n,n},
				{n,0,0,0,0,0,0,n,n,n,n,n,n,n,n,n,n,0,n,0,0,0,0,0,0,0,0,0,0,0,N,0,0,0,0,N,0,0,0,0,N,0,0,0,0,0,0,0,n,n,n},
				{n,0,0,0,n,n,n,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,n,n,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,g,n,n,n},
				{n,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,n,0,0,0,0,0,0,n,n,n,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,n,n,n,n},
				{n,0,0,0,0,0,0,0,0,n,0,0,0,0,w,0,0,n,m,0,0,0,0,0,n,n,n,u,u,u,u,u,u,u,u,u,u,u,u,u,u,u,u,u,u,0,0,0,n,n,n},
				{n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n}},



				//stage4,その他
			{	{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,R,0,L,0,0,0,0,0,0,c,e,c,0,c,0,0,w,0,n,n,n},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,R,0,L,0,0,0,0,0,0,c,0,c,0,n,n,n,U,n,n,n,n},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,R,0,L,0,0,0,0,0,0,c,h,c,0,n,n,r,0,l,n,n,n},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,R,0,L,0,0,0,0,0,0,0,0,0,0,n,n,r,0,l,n,n,n},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,R,0,L,h,h,h,h,h,0,0,0,0,0,n,n,r,0,l,n,n,n},
				{h,0,0,0,h,0,0,f,f,f,f,f,f,0,0,0,e,0,c,0,0,0,0,0,R,0,L,d,d,d,d,d,0,0,0,0,0,n,n,r,n,l,n,n,n},
				{h,0,0,0,h,h,h,0,0,0,0,0,0,h,h,h,h,h,0,0,0,0,0,0,0,J,0,0,0,0,0,0,0,0,h,h,0,n,n,r,0,l,n,n,n},
				{h,0,0,0,h,h,h,0,0,0,0,0,0,h,h,h,h,h,0,0,0,h,h,h,h,h,h,h,0,0,0,0,0,0,h,h,0,n,n,r,0,l,n,n,n},
				{h,0,0,0,h,h,h,0,0,0,0,0,0,h,h,h,h,h,0,0,0,h,h,h,h,h,h,h,0,0,0,0,0,0,0,0,0,n,n,r,g,l,n,n,n},
				{h,h,h,h,h,h,h,0,0,0,0,0,0,h,h,h,h,h,u,u,u,h,h,h,h,h,h,h,h,h,h,h,h,0,0,0,0,n,n,n,n,n,n,n,n}},

				//stage5 world1のボス
			{	{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,k2,0,0,0,0,0,h},
				{h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h}},

			//stage6 world1のボス
			{	{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,h},
				{h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h,h}


			}
		 		};

	public static int[][] getStageMap(int i){
		return map[i-1];
	}
}
