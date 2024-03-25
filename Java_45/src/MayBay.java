
public class  MayBay extends PhuongTienDiChuyen {
private String loaiNhienLieu;

public MayBay( HangSanXuat hangSanXuat, String loaiNhienLieu) {
	super("May Bay", hangSanXuat);
	this.loaiNhienLieu = loaiNhienLieu;
}

public String getLoaiNhienLieu() {
	return loaiNhienLieu;
}

public void setLoaiNhienLieu(String loaiNhienLieu) {
	this.loaiNhienLieu = loaiNhienLieu;
}

@Override
public double layVanToc() {
	// TODO Auto-generated method stub
	return 500;
}
public void catCanh() {
	System.out.println("Veo Veo Veo _____");
}
public void haCanh() {
	System.out.println("Vu Vu Vux _____");
}
}
