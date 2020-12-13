public com.mapper;

import java.sql.ResultSet;

public class DongGopMapper implements RowMapper<DongGopModel> {

	@Override
	public DongGopModel mapRow(ResultSet resultSet) {
		try {
			DongGopModel DG = new DongGopModel();
			DG.setMaDongGop(resultSet.getInt("madonggop"));
			DG.setMaHoKhau(resultSet.getInt("mahokhau"));
			DG.setSoTienDG(resultSet.getInt("sotiendg"));
			DG.setMaTheLoaiDG(resultSet.getInt("matheloaidg"));
			DG.setNgayDongGop(resultSet.getTimestamp("ngaydonggop"));
			
			}
			return DG;
		} catch (SQLException e) {
			return null;
		}	
	}
}