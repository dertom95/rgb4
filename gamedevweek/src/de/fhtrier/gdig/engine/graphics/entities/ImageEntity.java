package de.fhtrier.gdig.engine.graphics.entities;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import de.fhtrier.gdig.engine.management.AssetMgr;

public class ImageEntity extends AssetEntity {

	public ImageEntity(int id, int assetId, AssetMgr assets) {
		super(id, assetId, assets);
	}

	@Override
	public void renderImpl(Graphics graphicContext, Image frameBuffer) {
		if (isVisible()) {
			graphicContext.drawImage(getImageAsset(), 0, 0, this.getColorTint());
		}
		super.renderImpl(graphicContext, frameBuffer);
	}
	
	public Image getImageAsset() {
		return getAssetMgr().getImage(getAssetId());
	}
}
