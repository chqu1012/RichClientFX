package de.dc.spring.bootstrap.blog.model.gen

import de.dc.spring.bootstrap.blog.model.gen.IGenerator
import de.dc.spring.bootstrap.blog.model.TileSmallSection

class TileSmallSectionTemplate implements IGenerator<TileSmallSection> {
	
	override gen(TileSmallSection t)'''
	<section class="ftco-section bg-light" id="«t.uuid»"
		th:fragment="«t.uuid»">
		<div class="container">
			<div class="row justify-content-center mb-5 pb-5">
				<div class="col-md-7 heading-section text-center ftco-animate">
					<h2 class="mb-4">Emily's Months Collection</h2>
					<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia</p>
				</div>
			</div>
			<div class="row d-flex">
	
				«FOR tile : t.tiles»
				<div class="col-md-6 col-lg-4 d-flex ftco-animate">
					<div class="blog-entry justify-content-end">
						<a href="single.html" class="block-20" style="background-image:url(«tile.image»);"></a>
						<div class="text float-right d-block">
							<div class="d-flex align-items-center pt-2 mb-4 topp">
								<div class="one mr-2">
									<span class="day">«tile.day»</span>
								</div>
								<div class="two">
									<span class="yr">«tile.year»</span>
									<span class="mos">«tile.month»</span>
								</div>
							</div>
							<h3 class="heading">
								<a href="single.html">«tile.title»</a>
							</h3>
							<p>«tile.description»</p>
							<div class="d-flex align-items-center mt-4 meta">
								<p class="mb-0"><a href="#" class="btn btn-primary">Read More <span class="ion-ios-arrow-round-forward"></span></a></p>
							</div>
						</div>
					</div>
				</div>
				«ENDFOR»
				
			</div>
		</div>
	</section>
	'''
	
}