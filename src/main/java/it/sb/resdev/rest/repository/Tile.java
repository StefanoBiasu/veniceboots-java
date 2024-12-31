package it.sb.resdev.rest.repository;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tiles")
@Data
@NoArgsConstructor
public class Tile {

	@EmbeddedId
	private TileId tileId;

	@NotEmpty
	@NotNull
	@Column(name = "tile_data")
	private byte[] tile_data;

	public static Tile of(byte[] tile_data) {
		return new Tile(tile_data);
	}

	public Tile(byte[] tile_data) {
		this.tile_data = tile_data;
	}

	public TileId getTileId() {
		return tileId;
	}

	public byte[] getTile_data() {
		return tile_data;
	}
	

}
