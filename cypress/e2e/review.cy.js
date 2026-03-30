describe('check cottage reviews', () => {
    it('check cozy cottage vrbo reviews', () => {
        cy.visit('https://www.vrbo.com/2111572');
        cy.get('[data-stid="reviews-link"').first().should('contain.text', 'See all 37 reviews');
    })

    it('check haven hideaway vrbo reviews', () => {
        cy.visit('https://www.vrbo.com/2111556');
        cy.get('[data-stid="reviews-link"').first().should('contain.text', 'See all 25 reviews');
    })
})
