
public class BoPhim {
	private String tenPhim;
	private int namSanXuat;
	private HangSanXuat hangSanXuat;
	private Ngay ngayChieu;
	private double giaVe;

	public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, Ngay ngayChieu,double giaVe) {
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.ngayChieu = ngayChieu;
		this.giaVe = giaVe;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public Ngay getNgayChieu() {
		return ngayChieu;
	}

	public void setNgayChieu(Ngay ngayChieu) {
		this.ngayChieu = ngayChieu;
	}

	public String layTenHangSanXuat() {
		return this.hangSanXuat.getTenHangSanXuat();
	}

	public boolean kiemTraGiaVe(BoPhim phimkhac) {
		return this.giaVe < phimkhac.giaVe;
	}
	public double giaSauKhuyenMai(double x) {
		return this.giaVe *(1-x/100);
	}
}
